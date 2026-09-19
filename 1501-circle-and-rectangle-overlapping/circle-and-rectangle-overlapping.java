class Solution {
    public boolean checkOverlap(int r, int cx, int cy, int x1, int y1, int x2, int y2) {
        int b1=Math.max(x1,Math.min(cx,x2)) - cx;
        int b2=Math.max(y1,Math.min(cy,y2)) - cy;
        return b1*b1+b2*b2<=r*r;
    }
}