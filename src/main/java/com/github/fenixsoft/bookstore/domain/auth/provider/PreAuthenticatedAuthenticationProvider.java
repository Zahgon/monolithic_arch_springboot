/*
 * Copyright 2012-2020. the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. More information from:
 *
 *        https://github.com/fenixsoft
 */
package com.github.fenixsoft.bookstore.domain.auth.provider;

import com.github.fenixsoft.bookstore.domain.auth.AuthenticAccount;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedCredentialsNotFoundException;
import javax.inject.Named;

/**
 * 预验证身份认证器
 * <p>
 * 预验证是指身份已经在其他地方（第三方）确认过
 * 预验证器的目的是将第三方身份管理系统集成到具有Spring安全性的Spring应用程序中，在本项目中，用于JWT令牌过期后重刷新时的验证
 * 此时只要检查用户是否有停用、锁定、密码过期、账号过期等问题，如果没有，可根据JWT令牌的刷新过期期限，重新给客户端发放访问令牌
 *
 * @author icyfenix@gmail.com
 * @date 2020/3/10 11:25
 * @see <a href="https://docs.spring.io/spring-security/site/docs/3.0.x/reference/preauth.html">Pre-Authentication Scenarios</a>
 */
@Named
public class PreAuthenticatedAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 判断该验证器能处理哪些认证
     */
    @Override
    public boolean supports(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
