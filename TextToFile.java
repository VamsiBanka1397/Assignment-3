package com.assgn2rr;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class TextToFile {

        public void writing() {
            try {

                File statText = new File("E:/Java/Reference/bin/images/statsTest.txt");
                FileOutputStream is = new FileOutputStream(statText);
                OutputStreamWriter osw = new OutputStreamWriter(is);
                Writer w = new BufferedWriter(osw);
                w.write("POTATO!!!");
                w.close();
            } catch (IOException e) {
                System.err.println("Problem writing to the file statsTest.txt");
            }
        }

        public static void main(String[] args) {
            TextToFile Ttf = new TextToFile();
            Ttf.writing();
        }

    }
