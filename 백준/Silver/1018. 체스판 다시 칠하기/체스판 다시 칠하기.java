import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] chessBoard = new char[n][m];

        char[][] checkChessBoard_1 = new char[8][8];
        char[][] checkChessBoard_2 = new char[8][8];

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        checkChessBoard_1[i][j] = 'B';
                        checkChessBoard_2[i][j] = 'W';
                    } else {
                        checkChessBoard_1[i][j] = 'W';
                        checkChessBoard_2[i][j] = 'B';
                    }
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        checkChessBoard_1[i][j] = 'W';
                        checkChessBoard_2[i][j] = 'B';
                    } else {
                        checkChessBoard_1[i][j] = 'B';
                        checkChessBoard_2[i][j] = 'W';
                    }
                }
            }
        }

        for(int i=0; i<n; i++) {
            String words = br.readLine();
            for(int j=0; j<m; j++) {
                char c = words.charAt(j);
                chessBoard[i][j] = c;
            }
        }
        
        int min = 68;
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int count1 = 0;
                int count2 = 0;
                for (int x = i; x < 8 + i; x++) {
                    for (int y = j; y < 8 + j; y++) {
                        if (chessBoard[x][y] != checkChessBoard_1[x - i][y - j]) {
                            count1++;
                        }
                        if (chessBoard[x][y] != checkChessBoard_2[x - i][y - j]) {
                            count2++;
                        }
                    }
                }
                if (min > count1) {
                    min = count1;
                }
                if (min > count2) {
                    min = count2;
                }
            }
        }

        System.out.println(min);

    }
}