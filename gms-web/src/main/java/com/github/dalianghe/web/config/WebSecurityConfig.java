package com.github.dalianghe.web.config;

import com.github.dalianghe.web.security.AuthUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by admin on 2018/1/17.
 */
@Configuration
@EnableWebSecurity  // 开启Spring Security功能
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthUserDetailsService authUserDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()  // form方式登陆验证
                .loginPage("/login")  // 登陆url，对应界面form的action
                .defaultSuccessUrl("/index")  // 登陆成功跳转的url
                .permitAll()  // 允许所有
                .and()
                .logout() // 退出拦截
                .logoutUrl("/logout")  // 拦截的url，默认即为:/logout
                .logoutSuccessUrl("/login")  //  退出成功跳转url
                //.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .invalidateHttpSession(true)  // 销毁session
                .and()
                .authorizeRequests()
                .antMatchers("/**/*.css", "/img/**", "/**/*.js").permitAll()  // 静态资源过滤
                .and()
                .authorizeRequests().antMatchers("/**").authenticated();
        http.csrf().disable(); // 关闭csrf，允许POST等请求提交。开启csrf将更新LogoutFilter，仅适用HTTP POST，参考：http://blog.csdn.net/jxchallenger/article/details/58643152
        http.headers().frameOptions().disable();  // 解决X-Frame-Options deny
        // 禁用缓存
        //http.headers().cacheControl();
        //http.headers().contentTypeOptions().disable();
    }

    /*@Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception{
        builder.userDetailsService(authUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }*/

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(authUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

}
