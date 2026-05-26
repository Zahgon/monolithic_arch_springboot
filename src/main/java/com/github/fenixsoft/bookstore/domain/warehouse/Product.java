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
package com.github.fenixsoft.bookstore.domain.warehouse;

import com.github.fenixsoft.bookstore.domain.BaseEntity;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * 商品对象模型
 *
 * @author icyfenix@gmail.com
 * @date 2020/3/6 10:43
 */
@Entity
public class Product extends BaseEntity {

    @NotEmpty(message = "商品名称不允许为空")
    private String title;

    @NotNull(message = "商品应当有明确的价格")
    @Min(value = 0, message = "商品价格最低为零")
    private Double // 这里是偷懒，正式场合使用BigDecimal来表示金额
    price;

    @Min(value = 0, message = "评分最低为0")
    @Max(value = 10, message = "评分最高为10")
    private Float rate;

    private String description;

    private String cover;

    private String detail;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Set<Specification> specifications;

    public String getTitle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTitle(String title) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getPrice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPrice(Double price) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Float getRate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRate(Float rate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDescription(String description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCover() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCover(String cover) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDetail() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDetail(String detail) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<Specification> getSpecifications() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSpecifications(Set<Specification> specifications) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
