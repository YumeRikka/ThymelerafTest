package lrs.entity;

import java.util.Date;

/**
 * @author yyh
 * @date 2019/8/15-9:25
 */
public class Product {

    private String description;
    private Integer price;
    private Date availableFrom;
    private String saleType;// 销售类型:促销，拼团，闪购，其它

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public Product(final String description, final Integer price, final Date availableFrom, final String saleType) {
        this.description = description;
        this.price = price;
        this.availableFrom = availableFrom;
        this.saleType = saleType;
    }
    public Product(){

    }
    public Date getAvailableFrom() {
        return this.availableFrom;
    }

    public void setAvailableFrom(final Date availableFrom) {
        this.availableFrom = availableFrom;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(final Integer price) {
        this.price = price;
    }
}
