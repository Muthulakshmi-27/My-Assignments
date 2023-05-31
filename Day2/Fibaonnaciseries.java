package weeek1.Day2;

import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Fibaonnaciseries {
	public static void main(String[] args) {
		
		int a=11;
		int b=0;
		int c=1;
		System.out.println(b);
		for(int i=1;i<=a;i++) {
			int sum=b+c;
			b=c;
			c=sum;
			System.out.println(sum);

			
			
		}
	}
		
		
		

}
