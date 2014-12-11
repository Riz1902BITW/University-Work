{"changed":true,"filter":false,"title":"Test.java","tooltip":"/210CT_Programming/Portfolio/Item_3/6_Code/Test.java","value":"\nimport java.util.*;\n/**\n * Created by rob on 04/11/14.\n */\npublic class LongQuicks {\n\n\n    public static void main(String[] args){\n\n        int count = 0;\n        Random random = new Random();\n        int[] A = new int[512];\n        for (int i = 0 ; i<512;i++){\n            int var1 = random.nextInt(1000);\n            A[i] = var1;\n        }\n       QuickSort(A,0, A.length-1,0);\n\n        System.out.println(Arrays.toString(A));\n        System.out.println(count);\n\n    }\n\n\n    public static void QuickSort(int[]A, int start, int end,int count){\n\n       int pivot = Partition(A, start, end,count);\n            if( start <pivot-1) {\n                QuickSort(A,start,pivot-1,count);\n            }\n       if( end > pivot){\n            QuickSort(A,pivot ,end,count);}\n\n    }\n\n    public static int Partition(int [] A, int left,int right,int count){\n\n        int pivot = A[left];\n\n        while (left <= right){\n            while (A[left]< pivot){\n                left++;\n            }\n            while (A[right] > pivot){\n                right--;\n            }\n\n            if (left <= right){\n                int tmp = A[left];\n                A[left] = A[right];\n                A[right] = tmp;\n                count++;\n                left++;\n                right--;\n            }\n        }\nreturn left;\n    }\n}\n","undoManager":{"mark":9,"position":23,"stack":[[{"group":"doc","deltas":[{"start":{"row":0,"column":0},"end":{"row":60,"column":0},"action":"insert","lines":["package com.Sorting;","import java.util.*;","/**"," * Created by rob on 04/11/14."," */","public class Kiks {","","","    public static void main(String[] args){","","        int count = 0;","        Random random = new Random();","        int[] A = new int[512];","        for (int i = 0 ; i<512;i++){","            int var1 = random.nextInt(1000);","            A[i] = var1;","        }","       QuickSort(A,0, A.length-1,0);","","        System.out.println(Arrays.toString(A));","        System.out.println(count);","","    }","","","    public static void QuickSort(int[]A, int start, int end,int count){","","       int pivot = Partition(A, start, end,count);","            if( start <pivot-1) {","                QuickSort(A,start,pivot-1,count);","            }","       if( end > pivot){","            QuickSort(A,pivot ,end,count);}","","    }","","    public static int Partition(int [] A, int left,int right,int count){","","        int pivot = A[left];","","        while (left <= right){","            while (A[left]< pivot){","                left++;","            }","            while (A[right] > pivot){","                right--;","            }","","            if (left <= right){","                int tmp = A[left];","                A[left] = A[right];","                A[right] = tmp;","                count++;","                left++;","                right--;","            }","        }","return left;","    }","}",""]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":16},"end":{"row":5,"column":17},"action":"remove","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":15},"end":{"row":5,"column":16},"action":"remove","lines":["k"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":14},"end":{"row":5,"column":15},"action":"remove","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":13},"end":{"row":5,"column":14},"action":"remove","lines":["K"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":13},"end":{"row":5,"column":14},"action":"insert","lines":["T"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":14},"end":{"row":5,"column":15},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":15},"end":{"row":5,"column":16},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":16},"end":{"row":5,"column":17},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":0,"column":0},"end":{"row":0,"column":20},"action":"remove","lines":["package com.Sorting;"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":13},"end":{"row":5,"column":17},"action":"remove","lines":["Test"]},{"start":{"row":5,"column":13},"end":{"row":5,"column":14},"action":"insert","lines":["L"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":14},"end":{"row":5,"column":15},"action":"insert","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":15},"end":{"row":5,"column":16},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":16},"end":{"row":5,"column":17},"action":"insert","lines":["g"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":17},"end":{"row":5,"column":18},"action":"insert","lines":["Q"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":18},"end":{"row":5,"column":19},"action":"insert","lines":["u"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":19},"end":{"row":5,"column":20},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":20},"end":{"row":5,"column":21},"action":"insert","lines":["c"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":21},"end":{"row":5,"column":22},"action":"insert","lines":["k"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":22},"end":{"row":5,"column":23},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":23},"end":{"row":5,"column":24},"action":"insert","lines":["r"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":24},"end":{"row":5,"column":25},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":24},"end":{"row":5,"column":25},"action":"remove","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":5,"column":23},"end":{"row":5,"column":24},"action":"remove","lines":["r"]}]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":5,"column":23},"end":{"row":5,"column":23},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1416867189017}