
package com.math.utility.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.13
 * Thu Dec 04 11:24:22 CST 2014
 * Generated source version: 2.6.13
 */

@XmlRootElement(name = "addIntegers", namespace = "http://utility.math.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addIntegers", namespace = "http://utility.math.com/", propOrder = {"arg0", "arg1"})

public class AddIntegers {

    @XmlElement(name = "arg0")
    private int arg0;
    @XmlElement(name = "arg1")
    private int arg1;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

    public int getArg1() {
        return this.arg1;
    }

    public void setArg1(int newArg1)  {
        this.arg1 = newArg1;
    }

}

