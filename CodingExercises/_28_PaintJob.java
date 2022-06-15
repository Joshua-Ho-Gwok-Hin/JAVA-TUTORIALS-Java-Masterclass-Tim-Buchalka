public class _28_PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if ((width<=0)||(height<=0)||(areaPerBucket<=0)||(extraBuckets<0)){
            return -1;
        }else {
            double areaToCover = width * height;
            int totalBucketsRequired = (int) Math.ceil(areaToCover/areaPerBucket);
            if (extraBuckets<=totalBucketsRequired){
                return totalBucketsRequired - extraBuckets;
            }else return 0;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if ((width<=0)||(height<=0)||(areaPerBucket<=0)) {
            return -1;
        }else {
            double areaToCover = width * height;
            return (int) Math.ceil(areaToCover/areaPerBucket);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if ((area<=0)||(areaPerBucket<=0)) {
            return -1;
        }else {
            return (int) Math.ceil(area/areaPerBucket);
        }
    }


    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26,0.75));
    }
}
