{"filter":false,"title":"Test.java","tooltip":"/210CT_Programming/Portfolio/Item 3/6_Code/Test.java","undoManager":{"mark":8,"position":8,"stack":[[{"group":"doc","deltas":[{"start":{"row":0,"column":0},"end":{"row":60,"column":0},"action":"insert","lines":["package com.Sorting;","import java.util.*;","/**"," * Created by rob on 04/11/14."," */","public class Kiks {","","","    public static void main(String[] args){","","        int count = 0;","        Random random = new Random();","        int[] A = new int[512];","        for (int i = 0 ; i<512;i++){","            int var1 = random.nextInt(1000);","            A[i] = var1;","        }","       QuickSort(A,0, A.length-1,0);","","        System.out.println(Arrays.toString(A));","        System.out.println(count);","","    }","","","    public static void QuickSort(int[]A, int start, int end,int count){","","       int pivot = Partition(A, start, end,count);","            if( start <pivot-1) {","                QuickSort(A,start,pivot-1,count);","            }","       if( end > pivot){","            QuickSort(A,pivot ,end,count);}","","    }","","    public static int Partition(int [] A, int left,int right,int count){","","        int pivot = A[left];","","        while (left <= right){","            while (A[left]< pivot){","                left++;","            }","            while (A[right] > pivot){","                right--;","            }","","            if (left <= right){","                int tmp = A[left];","                A[left] = A[right];","                A[right] = tmp;","                count++;","                left++;","                right--;","            }","        }","return left;","    }","}",""]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":16},"end":{"row":5,"column":17},"action":"remove","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":15},"end":{"row":5,"column":16},"action":"remove","lines":["k"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":14},"end":{"row":5,"column":15},"action":"remove","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":13},"end":{"row":5,"column":14},"action":"remove","lines":["K"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":13},"end":{"row":5,"column":14},"action":"insert","lines":["T"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":14},"end":{"row":5,"column":15},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":15},"end":{"row":5,"column":16},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":16},"end":{"row":5,"column":17},"action":"insert","lines":["t"]}]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":5,"column":17},"end":{"row":5,"column":17},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1416867013948,"hash":"73060555e3bece4f8c800be155cb2f6394bf9002"}