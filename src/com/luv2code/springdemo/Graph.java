//package com.luv2code.springdemo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
//@Component
//public class Graph {
//    private CityList cityList;
//    private int vertices;
//    private int edges;
//    private List<LinkedList<Integer>> adj;
//
//
//
//    public Graph() throws IOException {
//        vertices = cityList.listOfCity().size();
//        if(vertices<0){
//            throw new IllegalArgumentException("Number of vertices must be nonnegative");
//        }
//        this.vertices=vertices;
//        this.edges=0;
//        adj=new ArrayList<LinkedList<Integer>>(vertices);
//        for(int i=0;i<vertices;i++){
//            adj.add(new LinkedList<Integer>());
//            }
//        }
//
//
//    public void edgeGraph() throws IOException {
//        List edgeList = getCityList().edgeList();
//        int e=edgeList.size();
//        if(e < 0)
//            throw new IllegalArgumentException("Number of edges must be nonnegative");
//        for(int i=0;i<e;i++){
//
////            int v = edgeList.get(e)[0];
////            int w = edgeList.get(e)[1];
////              addEdge(v,w);
//        }
//    }
//
//    public void addEdge(int v, int w) {
//        if(v < 0 || v >= vertices)
//            throw new IndexOutOfBoundsException();
//        if(w < 0 || w >= vertices)
//            throw new IndexOutOfBoundsException();
//        edges++;
//        adj.get(v).add(w);
//        adj.get(w).add(v);
//    }
//
//    public int getVertices() {
//        return vertices;
//    }
//
//    public int getEdges() {
//        return edges;
//    }
//
//    public Iterable<Integer> adj(int v) {
//        if(v < 0 || v >= vertices)
//            throw new IndexOutOfBoundsException();
//        return adj.get(v);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        String NEWLINE = System.getProperty("line.separator");
//        s.append(vertices + " vertices, " + edges + " edges " + NEWLINE);
//        for(int v = 0; v < vertices; v++) {
//            s.append(v + ": ");
//            for(int w : adj.get(v)) {
//                s.append(w + " ");
//            }
//            s.append(NEWLINE);
//        }
//        return s.toString();
//    }
//
//    @Autowired
//    public void setCityList(CityList theCityList){
//        this.cityList=theCityList;
//    }
//
//    public CityList getCityList(){
//        return cityList;
//    }
//}
