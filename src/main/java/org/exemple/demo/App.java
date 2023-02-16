package org.exemple.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {

		InputStream vInput;
		Properties vProp = new Properties();
		vInput = null;

		try {
			System.out.println("Hello World!");
			vInput=App.class.getResourceAsStream("/info.properties");
			vProp.load(vInput);
		} finally {
			if(vInput!=null) {
	        	vInput.close();
	        }
		}

		System.out.print("App Version :"+vProp.getProperty("org.exemple.demo.version", "?"));


    }
}
