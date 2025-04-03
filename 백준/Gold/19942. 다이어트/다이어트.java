import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb;
    static int n;
    static int minPrice = Integer.MAX_VALUE;
    static int[] standards = new int[4];
    static Ingredient[] ingredients;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        ingredients = new Ingredient[n + 1];
        visited = new boolean[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        standards[0] = Integer.parseInt(st.nextToken());
        standards[1] = Integer.parseInt(st.nextToken());
        standards[2] = Integer.parseInt(st.nextToken());
        standards[3] = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            ingredients[i] = new Ingredient(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
        }

        dfs(1, 0, 0, 0, 0, 0);
        System.out.print(minPrice == Integer.MAX_VALUE ? -1 : sb);
    }

    static void dfs(int depth, int protein, int fat, int carbohydrate, int vitamin, int price) {
        if (price >= minPrice) return;

        if (standards[0] <= protein && standards[1] <= fat && standards[2] <= carbohydrate && standards[3] <= vitamin) {
            minPrice = price;
            sb = new StringBuilder();
            sb.append(price).append("\n");
            for (int i = 1; i <= n; i++) {
                if (visited[i]) {
                    sb.append(i).append(" ");
                }
            }
            return;
        }

        if (depth > n) return;


        visited[depth] = true;
        dfs(depth + 1, protein + ingredients[depth].protein, fat + ingredients[depth].fat,
                carbohydrate + ingredients[depth].carbohydrate, vitamin + ingredients[depth].vitamin,
                price + ingredients[depth].price);
        visited[depth] = false;
        dfs(depth + 1, protein, fat, carbohydrate, vitamin, price);
    }

    static class Ingredient {
        int protein;
        int fat;
        int carbohydrate;
        int vitamin;
        int price;
        Ingredient(String protein, String fat, String carbohydrate, String vitamin, String price) {
            this.protein = Integer.parseInt(protein);
            this.fat = Integer.parseInt(fat);
            this.carbohydrate = Integer.parseInt(carbohydrate);
            this.vitamin = Integer.parseInt(vitamin);
            this.price = Integer.parseInt(price);
        }
    }
}