package com.luv2code.springdemo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class CityList {
        public void readCity() {
            String filePath = "city.txt";
            Resource resource1 = new ClassPathResource(filePath);
        }

            private List run() throws IOException {
                byte[] bytes = read("city.txt");
                List<String> list = Arrays.stream(new String(bytes).split("\n"))
                        .collect(Collectors.toList());
                return list;
            }

            private static byte[] read(String path) throws IOException {
                ClassPathResource resource = new ClassPathResource(path);
                return FileCopyUtils.copyToByteArray(resource.getInputStream());
            }


            public List<int[]> edgeList() throws IOException {
                List<int[]> edgeList = new ArrayList<>();
                Map<String,Integer> listOfCity=listOfCity();
                List<String> list = run();
                int length = list.size();
                for(String s:list){
                    s = s.trim();
                    int[] edge =new int[2];
                    String[] str = s.split(", ");
                        edge[0]=listOfCity.get(str[0]);
                        edge[1]=listOfCity.get(str[1]);
                        edgeList.add(edge);
                }
                return edgeList;
            }


            public Map<String,Integer> listOfCity() throws IOException {
                Map<String,Integer> listOfCity = new HashMap<>();
                List<String> list = run();
                int length = list.size();
                int cityNum=0;
                for(String s:list){
                    s = s.trim();
                    String[] str = s.split(", ");
                    for(int i=0;i<str.length;i++){
                        String city = str[i];
                        //System.out.println(city);
                        //System.out.println(city.length());
                        if(!listOfCity.containsKey(city)){
                            listOfCity.put(city,cityNum);
                            cityNum++;
                        }
                    }
                }
                return listOfCity;
            }

//    public static void main(String[] args) throws IOException {
//       // new CityList().listOfCity();
//       // System.out.println(new CityList().listOfCity().toString());
//       // System.out.println(new CityList().edgeList().get(3)[0]);
//    }
}

