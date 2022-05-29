package com.regms.security;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {

	/*
	 * public void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().antMatchers("/","/register")
	 * .permitAll().anyRequest()
	 * .authenticated().and().formLogin().loginPage("/home").permitAll()
	 * .and().logout().permitAll(); }
	 */
	/*
	 * @Bean
	 * 
	 * @Override public UserDetailsService userDetailsService() { UserDetails user =
	 * User.withDefaultPasswordEncoder() .username("user") .password("password")
	 * .build();
	 * 
	 * return new InMemoryUserDetailsManager(user); }
	 */
}
