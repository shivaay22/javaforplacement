import java.util.HashSet;

public class newDuplicate {
    
    public static int[] newDup(int arr[])
    {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            boolean flag = false;
            for(int j=i+1;j<n;j++)
            {
                if( arr[i] != arr[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag)
            {
                set.add(arr[i]);
            }
        }
        int result[] = new int[set.size()];
        int i = 0;
        for(int num : set)
        {
            result[i++] = num;
        }
        return result;
                // System.out.println(set);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,1 ,2};
       int ans[] = newDup(arr);
       for(int i=0;i<ans.length;i++)
       {
        System.out.print(ans[i] + " ");
       }
       System.out.println();
    }
}

/*
 * 
 *class Solution
{
    // Function to check whether all nodes of a tree have the value 
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        if (root == null || (root.left == null && root.right == null)) {
            // Null or leaf nodes satisfy the sum property
            return 1;
        }

        int leftData = 0;
        int rightData = 0;

        if (root.left != null) {
            leftData = root.left.data;
        }

        if (root.right != null) {
            rightData = root.right.data;
        }

        // Check current node and recursively check left and right subtrees
        if (root.data == (leftData + rightData) &&
            isSumProperty(root.left) == 1 &&
            isSumProperty(root.right) == 1) {
            return 1;
        }

        return 0;
    }
}

 */