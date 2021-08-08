// import java.util.Arrays;

// public class D {
//     public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
//         int n = obstacles.length;
//         int[] dp = new int[n];
//         Arrays.fill(dp, 1);
//         for (int i = 1; i < n; i++) {
//             for (int j = i - 1; j >= 0; j--) {
//                 if (obstacles[i] >= obstacles[j]) {
//                     dp[i] = Math.max(dp[i], dp[j] + 1);
//                     // break;
//                 }
//             }
//         }
//         return dp;
//         if (v.length == 0) // boundry case
//             return 0;

//         int[] tail = new int[v.length];
//         int length = 1; // always points empty slot in tail
//         tail[0] = v[0];

//         for (int i = 1; i < v.length; i++) {

//             if (v[i] > tail[length - 1]) {
//                 // v[i] extends the largest subsequence
//                 tail[length++] = v[i];
//             } else {
//                 // v[i] will extend a subsequence and
//                 // discard older subsequence

//                 // find the largest value just smaller than
//                 // v[i] in tail

//                 // to find that value do binary search for
//                 // the v[i] in the range from begin to 0 +
//                 // length
//                 int idx = Arrays.binarySearch(tail, 0, length - 1, v[i]);

//                 // binarySearch in java returns negative
//                 // value if searched element is not found in
//                 // array

//                 // this negative value stores the
//                 // appropriate place where the element is
//                 // supposed to be stored
//                 if (idx < 0)
//                     idx = -1 * idx - 1;

//                 // replacing the existing subsequene with
//                 // new end value
//                 tail[idx] = v[i];
//             }
//         }
//         return length;
//     }
// }
