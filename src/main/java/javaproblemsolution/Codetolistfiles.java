package javaproblemsolution;

import java.io.File;

public class Codetolistfiles {
	  public static File folder = new File("D:\\C4");
	  static String temp = "";

	  public static void main(String[] args) {
	   System.out.println("Reading files under the folder "+ folder.getAbsolutePath());
	   listFilesForFolder(folder);
	   
	  }

	  public static void listFilesForFolder(final File folder) {

	    for (final File fileEntry : folder.listFiles()) {
	      if (fileEntry.isDirectory()) {
	        listFilesForFolder(fileEntry);
	      } else 
	      {
	        if (fileEntry.isFile()) {
	          temp = fileEntry.getName();
	            System.out.println("File= " + folder.getAbsolutePath()+ "\\" + fileEntry.getName());
	        }

	      }
	    }
	  }
	}