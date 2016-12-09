
package test.wssope.amazon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Image complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Image">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits"/>
 *         &lt;element name="Width" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "url",
    "height",
    "width",
    "isVerified"
})
public class Image {

    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "Height", required = true)
    protected DecimalWithUnits height;
    @XmlElement(name = "Width", required = true)
    protected DecimalWithUnits width;
    @XmlElement(name = "IsVerified")
    protected String isVerified;

    /**
     * ��ȡurl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * ����url���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * ��ȡheight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getHeight() {
        return height;
    }

    /**
     * ����height���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setHeight(DecimalWithUnits value) {
        this.height = value;
    }

    /**
     * ��ȡwidth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getWidth() {
        return width;
    }

    /**
     * ����width���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setWidth(DecimalWithUnits value) {
        this.width = value;
    }

    /**
     * ��ȡisVerified���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVerified() {
        return isVerified;
    }

    /**
     * ����isVerified���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVerified(String value) {
        this.isVerified = value;
    }

}
