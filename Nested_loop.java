
public class Nested_loop {

    private static int j;

    public static void main(String[] args) {
        // // Solid Rectangle
        // int n = 4;
        // int m = 5;
        // //Outer loop
        // for (int i = 1; i <= n; i++) {
        //     int j;
        //     //Inter loop
        //     for (j = 1; j <= m; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Hollow Rectangle
        // int n = 4;
        // int m = 5;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         // cell -> (i,j)
        //         if (i == 1 || j == 1 || i == n || j == m) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // // Half Pyramid
        // int n = 4;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        //     //inner loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // Inverted Half Pyramid
        // int n = 4;
        // // outer loop
        // for (int i = n; i >= 1; i--) {
        //     //inner loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // Half triangle
        // int n = 4;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        //     //inner loop ->space print
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // inner loop ->star print
        //     for (j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
// // Half pyramid with Number
//         int n = 5;
//         // outer loop
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
// Inverted Half pyramid with Numbers
        // int n = 5;
        // // outer loop
        // for (int i = 0; i <= n; i++) {
        //     // inner loop
        //     for (int j = 1; j < n - i + 1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
//         // Floyd's Triangle
//         int n = 5;
//         int num = 1;
//         // outer loop
//         for (int i = 1; i <= n; i++) {
//             // inner loop
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
// // num = num + 1            
//             }
//             System.out.println();
//         }
// //
//         int n = 5;
// //  outer loop
//         for (int i = 1; i <= n; i++) {
// // inner loop
//             for (j = 1; j <= i; j++) {
//                 int sum = i + j;
//                 if (sum % 2 == 0) {
//                     //even
//                     System.out.print("1 ");
//                 } else {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
// //self create a star print 
//         int n = 5;
// //outer loop
//         for (int i = n; i >= 1; i--) {
//             //inner loop
//             for (j = 1; j <= i; j++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
// //Butterfly pattern
        int n = 5;
        //upper part
        for (int i = 1; i <= n; i++) {
            //first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            //first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
