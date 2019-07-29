package com.example.plusfenye.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author qmh
 * @since 2019-07-28
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bookId;

    private String bookName;

    private String bookAuthor;

    /**
     * 现价
     */
    private BigDecimal money;

    /**
     * 原价
     */
    private BigDecimal originalPrice;

    /**
     * 出版社
     */
    private String bookPrinter;

    /**
     * 上架时间
     */
    private Date bookDate;

    private String bookImage;

    /**
     * 浏览次数
     */
    private Integer browseCount;

    /**
     * 推荐值，越大越靠前
     */
    private Integer recommendValue;

    /**
     * 销量
     */
    private Integer sales;

    /**
     * 库存
     */
    private Integer bookInventory;

    /**
     * 0为未上架，1为上架，2为下架
     */
    private String bookState;

    private String bookDescription;

    /**
     * 图书类型，假外键
     */
    private Integer bookType;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }
    public String getBookPrinter() {
        return bookPrinter;
    }

    public void setBookPrinter(String bookPrinter) {
        this.bookPrinter = bookPrinter;
    }
    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }
    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }
    public Integer getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }
    public Integer getRecommendValue() {
        return recommendValue;
    }

    public void setRecommendValue(Integer recommendValue) {
        this.recommendValue = recommendValue;
    }
    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
    public Integer getBookInventory() {
        return bookInventory;
    }

    public void setBookInventory(Integer bookInventory) {
        this.bookInventory = bookInventory;
    }
    public String getBookState() {
        return bookState;
    }

    public void setBookState(String bookState) {
        this.bookState = bookState;
    }
    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }
    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
            "bookId=" + bookId +
            ", bookName=" + bookName +
            ", bookAuthor=" + bookAuthor +
            ", money=" + money +
            ", originalPrice=" + originalPrice +
            ", bookPrinter=" + bookPrinter +
            ", bookDate=" + bookDate +
            ", bookImage=" + bookImage +
            ", browseCount=" + browseCount +
            ", recommendValue=" + recommendValue +
            ", sales=" + sales +
            ", bookInventory=" + bookInventory +
            ", bookState=" + bookState +
            ", bookDescription=" + bookDescription +
            ", bookType=" + bookType +
        "}";
    }
}
