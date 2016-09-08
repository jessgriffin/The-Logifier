/****************************************************************************
 *
 * Created by: Jess Griffin
 * Created on: Sept 2016
 * This program calculates the number of logs that will fit on a truck,
 *     if you know their length
 *
 ****************************************************************************/

import java.io.*;

public class TheLogifier {


 public static void main(String[] args) throws IOException {
 double length;
 double logs;
  InputStreamReader r = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(r);

  System.out.println("Are your logs 0.25m, 0.5m or 1m long?");

  length =  Double.parseDouble(br.readLine());

  logs = 1100.0/(20.0*length);

  System.out.println(logs);

 }

}
