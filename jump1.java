import java.util.*;

public class jump1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ans[] = new int[n];
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            ans[i] = Integer.MAX_VALUE;
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        ans[maxIndex] = 0;

        Stack<Integer> st = new Stack<>();
        st.add(maxIndex);
        for (int i = maxIndex - 1; i >= 0; i--) {

            while (arr[i] > arr[st.peek()])
                st.pop();
            ans[i] = ans[st.peek()] + 1;
            st.add(i);
        }

        st.clear();
        st.add(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()])
                st.pop();
            if (!st.isEmpty())
                ans[i] = Math.min(ans[i], ans[st.peek()] + 1);
            st.add(i);
        }

        Scanner scr = new Scanner(System.in);
        int m = scr.nextInt();
        int arr2[] = new int[m];
        int ans2[] = new int[m];
        // int maxIndex2 = 0;
        for (int i = 0; i < m; i++) {
            arr2[i] = scr.nextInt();
            ans2[i] = Integer.MAX_VALUE;
            if (arr2[i] > arr2[maxIndex])
                maxIndex = i;
        }
        ans2[maxIndex] = 0;

        Stack<Integer> st2 = new Stack<>();
        st2.add(maxIndex);
        for (int i = maxIndex - 1; i >= 0; i--) {

            while (arr2[i] > arr2[st2.peek()])
                st2.pop();
            ans2[i] = ans2[st2.peek()] + 1;
            st2.add(i);
        }

        st2.clear();
        st2.add(0);
        for (int i = 1; i < m; i++) {
            while (!st2.isEmpty() && arr2[i] > arr2[st2.peek()])
                st2.pop();
            if (!st2.isEmpty())
                ans2[i] = Math.min(ans2[i], ans2[st2.peek()] + 1);
            st2.add(i);
        }
        System.out.println();
        for (int i : ans)
            System.out.print(i + " ");
        System.out.println();
        for (int i : ans2)
            System.out.print(i + " ");

    }

}