package com.tomato.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
//    @Autowired
//    private ISysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       /* SysUser sysUser=sysUserService.findUserByAccount(username);
        String password= ObjectUtils.isEmpty(sysUser)?"":sysUser.getPassword();*/
        return new User(username, "1", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
