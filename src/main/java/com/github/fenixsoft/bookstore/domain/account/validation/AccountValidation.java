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
package com.github.fenixsoft.bookstore.domain.account.validation;

import com.github.fenixsoft.bookstore.domain.account.Account;
import com.github.fenixsoft.bookstore.domain.account.AccountRepository;
import com.github.fenixsoft.bookstore.domain.auth.AuthenticAccount;
import org.springframework.security.core.context.SecurityContextHolder;
import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * 用户对象校验器
 * <p>
 * 如，新增用户时，判断该用户对象是否允许唯一，在修改用户时，判断该用户是否存在
 *
 * @author icyfenix@gmail.com
 * @date 2020/3/11 14:22
 */
public class AccountValidation<T extends Annotation> implements ConstraintValidator<T, Account> {

    @Inject
    protected AccountRepository repository;

    protected Predicate<Account> predicate = c -> true;

    @Override
    public boolean isValid(Account value, ConstraintValidatorContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class ExistsAccountValidator extends AccountValidation<ExistsAccount> {

        public void initialize(ExistsAccount constraintAnnotation) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class AuthenticatedAccountValidator extends AccountValidation<AuthenticatedAccount> {

        public void initialize(AuthenticatedAccount constraintAnnotation) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class UniqueAccountValidator extends AccountValidation<UniqueAccount> {

        public void initialize(UniqueAccount constraintAnnotation) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class NotConflictAccountValidator extends AccountValidation<NotConflictAccount> {

        public void initialize(NotConflictAccount constraintAnnotation) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
