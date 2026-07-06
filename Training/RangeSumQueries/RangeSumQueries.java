package Training.RangeSumQueries;

public class RangeSumQueries {
    public static void main(String[] args) {
        
    }

    int[] tree;
    int n;

    public void NumArray(int[] nums) {
        n = nums.length;
        tree = new int[4 * n];

        buildTree(tree,0,n-1,nums,0);
    }

    public void buildTree(int[] tree,int l, int r,int[] nums,int i){
        if (l == r) {
            tree[i] = nums[l];
        }

        int m = l + (r - l)/2;

        buildTree(tree, l, m, nums, 2 * i + 1);
        buildTree(tree, m + 1, r, nums, 2 * i + 2);
        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
    }
    
    public void update(int index, int val) {
        updateQuery(tree, 0, n-1, 0, index, val);
    }

    public void updateQuery(int[] tree, int l, int r, int i, int index, int val){
        if (l == r) {
            tree[i] = val;
        }

        int m = l + (r - l)/2;

        if (index <= m) {
            updateQuery(tree, l, m, 2 * i + 1, index, val);
        }else{
            updateQuery(tree, m + 1, r, 2 * i + 2, index, val);
        }

        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
    }

    public int query(int[] tree, int l, int r, int i, int left, int right){

        if (r < left || l > right) {
            return 0;
        }

        if (l >= left && r <= right) {
            return tree[i];
        }

        int m = l + (r - l)/2;

        int la = query(tree, l, m, 2 * i + 1, left, right);
        int ra = query(tree, m + 1, r, 2 * i + 2, left, right);

        return la + ra;
    }
    
    public int sumRange(int left, int right) {
        return query(tree, 0, n- 1, 0, left, right);
    }
}
