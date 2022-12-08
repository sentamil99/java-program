package com.Regex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNotFinding {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MobileNotFinding m =new MobileNotFinding();
		m.mobileNamber();
	}

	private void mobileNamber() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/home/sentamil/Documents/info.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		//String read=br.readLine();
		//System.out.println(read);
		int read=br.read();
		String mobile="";
		while(read!=-1) {
			char ch=(char)read;
			mobile=mobile+ch;
			read =br.read();
		}
		System.out.println(mobile);
	Pattern patternObj=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		
		Matcher matcherObj=patternObj.matcher(mobile);
		while(matcherObj.find()) {
			//System.out.println(matcherObj.group());
			mobile=matcherObj.group();
		}
		File ff =new File("/home/sentamil/Documents/vikky.txt");
		FileWriter fw = new FileWriter(ff);   //true does not old content change 
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(mobile);
		bw.flush();
		bw.close();
		
	}
	
}
