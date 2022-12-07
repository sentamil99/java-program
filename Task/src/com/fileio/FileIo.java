package com.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.cert.Extension;

public class FileIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileIo fi =new FileIo();
		//fi.createFile();
		//fi.createFolder();
		//fi.Files_Folder_List();	
		//fi.deletefile();
		//fi.exists();
		//fi.listofFileOnly();
		//fi.listOfFolderOnly();
		//fi.extension();
		fi.writefile();
		//fi.bufferedwriter();
		//fi.readfile();
   }

	private void readfile() throws IOException {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents/vikky.txt");
		FileReader fr=new FileReader(f);
		int read=fr.read();
		int count=1;
		while(read!=-1) {
			char ch=(char)read;
		//	System.out.print(ch);
			if(ch==' ') {
				count++;
			}
			read=fr.read();
		}
		System.out.println(count);
	}

	private void bufferedwriter() throws IOException {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents/vikky.txt");
		FileWriter fw = new FileWriter(f,true);   //true does not old content change 
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("sam");
		bw.newLine();
		bw.write("saran");
		bw.flush();
		bw.close();
		
	}

	private void writefile() throws IOException {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents/vikky.txt");
		FileWriter fw = new FileWriter(f);//true does not old content change 
		fw.write("mani");
		fw.write("\n");
		fw.write("thamil");
		fw.flush();
		fw.close();
				
	}
	private void extension() {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents");
		File [] file=f.listFiles();
		for(File ff:file) {
			if(ff.isFile()) {
				String name=ff.getName();
				System.out.println(name);
				String extension=name.substring(name.length()-3);
				if(extension.equals("txt")) {
					System.out.println(name);
				}
			}
		}
	}

	private void listOfFolderOnly() {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents");
		File [] file=f.listFiles();
		for(File ff:file) {
			if(ff.isDirectory()) {
				System.out.println(ff);
			}
		}
	}

	

	private void listofFileOnly() {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents");
		File [] file=f.listFiles();
		for(File ff:file) {
			if(ff.isFile()) {
				System.out.println(ff);
			}
		}
	}

	private void exists() {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents/ram.txt");
		System.out.println(f.exists());
	}

	private void deletefile() {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents/ram.txt");
		f.delete();
	}
	
	private void Files_Folder_List() throws IOException {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents");
		f.createNewFile();
		System.out.println(f.exists());
		String[] file = f.list();
		for(String fileName:file) {
			System.out.println(fileName);
		}
	}

	private void createFolder() {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents/Virat");
		f.mkdir();
	}

	private void createFile() throws IOException {
		// TODO Auto-generated method stub
		File f =new File("/home/sentamil/Documents/Eclips.txt");
		f.createNewFile();
	}
		}
	
	
