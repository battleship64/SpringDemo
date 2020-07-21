package com.luv2code.springdemo;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
   // public static int[] findTwoSum(int[] list, int sum) {

    //}

    public static void main(String[] args) {
        //int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);

        int[] index = new int[]{0,1};
        int[] nums ={ 3, 1, 5, 7, 5, 9 };
        int target =10;
        int index1,index2;
        Set nset = new HashSet();

        for(int i=0;i<nums.length;i++) {
            if (nset.add(target - nums[i])) {
                nset.remove(target - nums[i]);
                nset.add(nums[i]);
            } else {
                index[1] = i + 1;
                for (int j = 0; j < i; j++) {
                    if (target == (nums[i] + nums[j])) {
                        index[0] = j + 1;

                    }
                }
                if (index != null) {
                    System.out.println(index[0] + " " + index[1]);
                }
            }
        }


        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                index[1]=i+1;
                index[0]=hm.get(target-nums[i])+1;
                if(index != null) {
                    System.out.println(index[0] + " " + index[1]);
                }
            }else {
                hm.put(nums[i],i);
            }
        }
        if(index != null) {
            System.out.println(index[0] + " " + index[1]);
        }


        }

    }

