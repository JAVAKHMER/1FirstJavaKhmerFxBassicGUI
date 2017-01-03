package com_javakhmer_4a_SinpleDoubleProperty_bind_property_www;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SimpleBinding {
	public static void main(String[] args) {
		DoubleProperty b1 = new SimpleDoubleProperty(2.2);
		DoubleProperty b2 = new SimpleDoubleProperty(4.5);
		System.out.println( " b1 equal " + b1.getValue() + " b2 equal "+ b2.getValue());
		b1.bind(b2);
		System.out.println( " Now b1 equal " + b1.getValue() + " b2 equal "+ b2.getValue());
		b1.bind(b2.multiply(2));
		System.out.println( " Now b1 equal " + b1.getValue() + " b2 equal "+ b2.getValue());
		b1.bind(b2.add(2));
		System.out.println( " Now b1 equal " + b1.getValue() + " b2 equal "+ b2.getValue());
		b2.setValue(5.3);
		System.out.println( " Now b1 equal " + b1.getValue() + " b2 equal "+ b2.getValue());
	}
}
