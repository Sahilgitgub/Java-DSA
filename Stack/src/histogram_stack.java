import java.util.Stack;

public class histogram_stack {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        Stack<Integer>st =new Stack<>();
        int n=arr.length;
        int nge[]=new int[n];
        int pge[]=new int[n];

        //calculate nge(next greater element)

        st.push(n-1);
        nge[n-1]=n;
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                nge[i]=n;
            }
            else {
                nge[i]=st.peek();
            }
            st.push(i);
        }
        //empty stack
        while(st.size()>0)
        {
            st.pop();
        }

        //previous greater element

        st.push(0);
        pge[0]=-1;

        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                pge[i]=-1;
            }
            else {
                pge[i]=st.peek();
            }
            st.push(i);
        }

        int max=-1;
        for(int i=0;i<n;i++)
        {
            int area=arr[i]*(nge[i]-pge[i]-1);
            max=Math.max(max,area);
        }
     System.out.print("Maximum area: " + max);
    }
}


//import java.util.Stack;
//
//public class histogram_stack {
//    public static void main(String[] args) {
//        int arr[] = {2, 1, 5, 6, 2, 3};
//        Stack<Integer> st = new Stack<>();
//        int n = arr.length;
//        int nge[] = new int[n];
//        int pge[] = new int[n];
//
//        // Print the original histogram
//        System.out.println("Histogram: ");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        // Calculate nge (Next Greater Element)
//        st.push(n - 1);
//        nge[n - 1] = n;
//        for (int i = n - 2; i >= 0; i--) {
//            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
//                st.pop();
//            }
//            if (st.size() == 0) {
//                nge[i] = n;
//            } else {
//                nge[i] = st.peek();
//            }
//            st.push(i);
//        }
//
//        // Empty stack
//        while (st.size() > 0) {
//            st.pop();
//        }
//
//        // Calculate pge (Previous Greater Element)
//        st.push(0);
//        pge[0] = -1;
//        for (int i = 1; i < n; i++) {
//            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
//                st.pop();
//            }
//            if (st.size() == 0) {
//                pge[i] = -1;
//            } else {
//                pge[i] = st.peek();
//            }
//            st.push(i);
//        }
//
//        // Print nge and pge arrays
//        System.out.println("Next Greater Element (NGE): ");
//        for (int i : nge) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        System.out.println("Previous Greater Element (PGE): ");
//        for (int i : pge) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        // Calculate and print the area of each histogram bar and the maximum area
//        int max = 0;
//        System.out.println("Areas of rectangles: ");
//        for (int i = 0; i < n; i++) {
//            int area = arr[i] * (nge[i] - pge[i] - 1);
//            System.out.println("Bar " + arr[i] + ": " + area);
//            max = Math.max(max, area);
//        }
//
//        System.out.println("Maximum area: " + max);
//    }
//}
