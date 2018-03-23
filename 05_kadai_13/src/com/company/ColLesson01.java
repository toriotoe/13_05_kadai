package com.company;

import java.io.*;
import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        Word[] Diccionary = new Word[10];
        int Diccionary_len = Diccionary.length;
        int p = 1;

        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください。");

            for (int i =0; i < 10; i++) {
                Diccionary[i] = new Word("","");
                String word = br.next();
                if ("e".equals(word)){break;}
                String meaning = br.next();
                System.out.println("次の単語と意味を入力してください。'e'で終了します。");
                p++;
             }

        for (int j =1; j < Diccionary.length; j++) {
            System.out.println("単語:" + Diccionary[j].word + "意味:" + Diccionary[j].meaning);
        }

        System.out.println( p  + "件、登録しました。");
    }
}