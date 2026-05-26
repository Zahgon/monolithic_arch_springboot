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
package com.github.fenixsoft.bookstore.domain.payment;

import com.github.fenixsoft.bookstore.domain.BaseEntity;
import com.github.fenixsoft.bookstore.domain.warehouse.Product;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * 商品库存
 *
 * @author icyfenix@gmail.com
 * @date 2020/3/12 16:34
 */
@Entity
public class Stockpile extends BaseEntity {

    private Integer amount;

    private Integer frozen;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private transient Product product;

    public Integer getAmount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAmount(Integer amount) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void frozen(Integer number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void thawed(Integer number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void decrease(Integer number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void increase(Integer number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Product getProduct() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setProduct(Product product) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
