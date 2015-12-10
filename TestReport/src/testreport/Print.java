/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreport;

import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author longnt
 */

public class Print {
    
   
    
    
    
  
    private HashMap hashMap;
    private JTable tbl;
    
    
   
   

    public Print() {
        String str[] = new String[15];
        DefaultTableModel tableModel = new DefaultTableModel(str, 1);
        tbl = new JTable(tableModel);
        String[] keys;
        keys = new String[]{
            "bophan","duan","hoten","addr","day","m","year","quyenso","sotien",
            "bangchu","kemtheo"
        };
        hashMap = new HashMap();
        String[] values ;
        values = new String[15];
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhap ten phong ban: ");
        values[0] = nhap.nextLine();
        Object put = hashMap.put("bophan", values[0]);
        
        System.out.print("Nhap ten Du an: ");
        values[1] = nhap.nextLine();
        Object put1 = hashMap.put("duan", values[1]);
        
        System.out.print("Nhap ten nguoi nop: ");
        values[2] = nhap.nextLine();
        Object put2 = hashMap.put("hoten", values[2]);
        
        System.out.print("Nhap dia chi : ");
        values[3] = nhap.nextLine();
        Object put3 = hashMap.put("addr", values[3]);
        
        System.out.print("Ly do nop: ");
        values[4]= nhap.nextLine();
        Object put4 = hashMap.put("lydo", values[4]);
        
        System.out.print("So tien bang chu: ");
        values[5] = nhap.nextLine();
        Object put5 = hashMap.put("bangchu", values[5]);
        
        System.out.print("Thong tin kem theo: ");
        values[6]= nhap.nextLine();
        Object put6 = hashMap.put("kemtheo", values[6]);
        
        int[] values1;
        values1 = new int[15];
        
        System.out.print("So tien: ");
        values1[0]= nhap.nextInt();
        Object put7 = hashMap.put("sotien", values1[0]);
        
        System.out.print("Nhap ngay : ");
        values1[1] = nhap.nextInt();
        Object put8 = hashMap.put("day", values1[1]);
        
         System.out.print("Nhap thang : ");
        values1[2] = nhap.nextInt();
        Object put9 = hashMap.put("m", values1[2]);
        
         System.out.print("Nhap nam : ");
        values1[3] = nhap.nextInt();
        Object put10 = hashMap.put("year", values1[3]);
        
        Object put11 = hashMap.put("quyenso", "Quyen 1");
        //String[] values = new String[]{
        //"Phòng IT","Đào tạo","Trần Văn A","Cổ Nhuế"
        //};
        //hashMap = new HashMap(); 
        //if (keys.length == values.length) {
        //    for (int i = 0; i < keys.length; i++) {
        //        hashMap.put(keys[i], values[i]);
        //   }
        //}
        //String[] values = new String[10];
        //Scaner nhap = new Scaner(System.in);
        //System.out.print("Nhap ten phong ban: ");
        //values[0] = nhap.toString();
        //hashMap.put(keys[0], values[0]);
   
        }
    
    

    public void print() {
        //  reportExport("/home/longnt/testA4.jasper", hashMap,tbl.getModel(),true);
        reportExport("testA4.jasper", hashMap, tbl.getModel(), false);
    }

    private void reportExport(String filePathResource, HashMap hashMap, TableModel model, boolean flag) {
        ReportManager.getInstance().viewReport(filePathResource, hashMap, model, flag);
    }
     };


