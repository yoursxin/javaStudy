
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
 *         &lt;element name="LowestNewPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestUsedPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestCollectiblePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestRefurbishedPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="TotalNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalCollectible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalRefurbished" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "lowestNewPrice",
    "lowestUsedPrice",
    "lowestCollectiblePrice",
    "lowestRefurbishedPrice",
    "totalNew",
    "totalUsed",
    "totalCollectible",
    "totalRefurbished"
})
@XmlRootElement(name = "OfferSummary")
public class OfferSummary {

    @XmlElement(name = "LowestNewPrice")
    protected Price lowestNewPrice;
    @XmlElement(name = "LowestUsedPrice")
    protected Price lowestUsedPrice;
    @XmlElement(name = "LowestCollectiblePrice")
    protected Price lowestCollectiblePrice;
    @XmlElement(name = "LowestRefurbishedPrice")
    protected Price lowestRefurbishedPrice;
    @XmlElement(name = "TotalNew")
    protected String totalNew;
    @XmlElement(name = "TotalUsed")
    protected String totalUsed;
    @XmlElement(name = "TotalCollectible")
    protected String totalCollectible;
    @XmlElement(name = "TotalRefurbished")
    protected String totalRefurbished;

    /**
     * ��ȡlowestNewPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestNewPrice() {
        return lowestNewPrice;
    }

    /**
     * ����lowestNewPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestNewPrice(Price value) {
        this.lowestNewPrice = value;
    }

    /**
     * ��ȡlowestUsedPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestUsedPrice() {
        return lowestUsedPrice;
    }

    /**
     * ����lowestUsedPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestUsedPrice(Price value) {
        this.lowestUsedPrice = value;
    }

    /**
     * ��ȡlowestCollectiblePrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestCollectiblePrice() {
        return lowestCollectiblePrice;
    }

    /**
     * ����lowestCollectiblePrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestCollectiblePrice(Price value) {
        this.lowestCollectiblePrice = value;
    }

    /**
     * ��ȡlowestRefurbishedPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestRefurbishedPrice() {
        return lowestRefurbishedPrice;
    }

    /**
     * ����lowestRefurbishedPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestRefurbishedPrice(Price value) {
        this.lowestRefurbishedPrice = value;
    }

    /**
     * ��ȡtotalNew���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNew() {
        return totalNew;
    }

    /**
     * ����totalNew���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNew(String value) {
        this.totalNew = value;
    }

    /**
     * ��ȡtotalUsed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalUsed() {
        return totalUsed;
    }

    /**
     * ����totalUsed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalUsed(String value) {
        this.totalUsed = value;
    }

    /**
     * ��ȡtotalCollectible���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCollectible() {
        return totalCollectible;
    }

    /**
     * ����totalCollectible���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCollectible(String value) {
        this.totalCollectible = value;
    }

    /**
     * ��ȡtotalRefurbished���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRefurbished() {
        return totalRefurbished;
    }

    /**
     * ����totalRefurbished���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRefurbished(String value) {
        this.totalRefurbished = value;
    }

}
