
package test.wssope.amazon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Request" minOccurs="0"/>
 *         &lt;element name="CartId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URLEncodedHMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PurchaseURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileCartURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartItems" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SavedForLaterItems" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SimilarProducts" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}TopSellers" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}NewReleases" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SimilarViewedProducts" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}OtherCategoriesSimilarProducts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "cartId",
    "hmac",
    "urlEncodedHMAC",
    "purchaseURL",
    "mobileCartURL",
    "subTotal",
    "cartItems",
    "savedForLaterItems",
    "similarProducts",
    "topSellers",
    "newReleases",
    "similarViewedProducts",
    "otherCategoriesSimilarProducts"
})
@XmlRootElement(name = "Cart")
public class Cart {

    @XmlElement(name = "Request")
    protected Request request;
    @XmlElement(name = "CartId", required = true)
    protected String cartId;
    @XmlElement(name = "HMAC", required = true)
    protected String hmac;
    @XmlElement(name = "URLEncodedHMAC", required = true)
    protected String urlEncodedHMAC;
    @XmlElement(name = "PurchaseURL")
    protected String purchaseURL;
    @XmlElement(name = "MobileCartURL")
    protected String mobileCartURL;
    @XmlElement(name = "SubTotal")
    protected Price subTotal;
    @XmlElement(name = "CartItems")
    protected CartItems cartItems;
    @XmlElement(name = "SavedForLaterItems")
    protected SavedForLaterItems savedForLaterItems;
    @XmlElement(name = "SimilarProducts")
    protected SimilarProducts similarProducts;
    @XmlElement(name = "TopSellers")
    protected TopSellers topSellers;
    @XmlElement(name = "NewReleases")
    protected NewReleases newReleases;
    @XmlElement(name = "SimilarViewedProducts")
    protected SimilarViewedProducts similarViewedProducts;
    @XmlElement(name = "OtherCategoriesSimilarProducts")
    protected OtherCategoriesSimilarProducts otherCategoriesSimilarProducts;

    /**
     * ��ȡrequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * ����request���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * ��ȡcartId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * ����cartId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartId(String value) {
        this.cartId = value;
    }

    /**
     * ��ȡhmac���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMAC() {
        return hmac;
    }

    /**
     * ����hmac���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMAC(String value) {
        this.hmac = value;
    }

    /**
     * ��ȡurlEncodedHMAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLEncodedHMAC() {
        return urlEncodedHMAC;
    }

    /**
     * ����urlEncodedHMAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLEncodedHMAC(String value) {
        this.urlEncodedHMAC = value;
    }

    /**
     * ��ȡpurchaseURL���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseURL() {
        return purchaseURL;
    }

    /**
     * ����purchaseURL���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseURL(String value) {
        this.purchaseURL = value;
    }

    /**
     * ��ȡmobileCartURL���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileCartURL() {
        return mobileCartURL;
    }

    /**
     * ����mobileCartURL���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileCartURL(String value) {
        this.mobileCartURL = value;
    }

    /**
     * ��ȡsubTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getSubTotal() {
        return subTotal;
    }

    /**
     * ����subTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setSubTotal(Price value) {
        this.subTotal = value;
    }

    /**
     * ��ȡcartItems���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CartItems }
     *     
     */
    public CartItems getCartItems() {
        return cartItems;
    }

    /**
     * ����cartItems���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CartItems }
     *     
     */
    public void setCartItems(CartItems value) {
        this.cartItems = value;
    }

    /**
     * ��ȡsavedForLaterItems���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SavedForLaterItems }
     *     
     */
    public SavedForLaterItems getSavedForLaterItems() {
        return savedForLaterItems;
    }

    /**
     * ����savedForLaterItems���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SavedForLaterItems }
     *     
     */
    public void setSavedForLaterItems(SavedForLaterItems value) {
        this.savedForLaterItems = value;
    }

    /**
     * ��ȡsimilarProducts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SimilarProducts }
     *     
     */
    public SimilarProducts getSimilarProducts() {
        return similarProducts;
    }

    /**
     * ����similarProducts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarProducts }
     *     
     */
    public void setSimilarProducts(SimilarProducts value) {
        this.similarProducts = value;
    }

    /**
     * ��ȡtopSellers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TopSellers }
     *     
     */
    public TopSellers getTopSellers() {
        return topSellers;
    }

    /**
     * ����topSellers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TopSellers }
     *     
     */
    public void setTopSellers(TopSellers value) {
        this.topSellers = value;
    }

    /**
     * ��ȡnewReleases���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NewReleases }
     *     
     */
    public NewReleases getNewReleases() {
        return newReleases;
    }

    /**
     * ����newReleases���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NewReleases }
     *     
     */
    public void setNewReleases(NewReleases value) {
        this.newReleases = value;
    }

    /**
     * ��ȡsimilarViewedProducts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SimilarViewedProducts }
     *     
     */
    public SimilarViewedProducts getSimilarViewedProducts() {
        return similarViewedProducts;
    }

    /**
     * ����similarViewedProducts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarViewedProducts }
     *     
     */
    public void setSimilarViewedProducts(SimilarViewedProducts value) {
        this.similarViewedProducts = value;
    }

    /**
     * ��ȡotherCategoriesSimilarProducts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OtherCategoriesSimilarProducts }
     *     
     */
    public OtherCategoriesSimilarProducts getOtherCategoriesSimilarProducts() {
        return otherCategoriesSimilarProducts;
    }

    /**
     * ����otherCategoriesSimilarProducts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCategoriesSimilarProducts }
     *     
     */
    public void setOtherCategoriesSimilarProducts(OtherCategoriesSimilarProducts value) {
        this.otherCategoriesSimilarProducts = value;
    }

}
