#include <iostream>
#include <vector>
#include <algorithm>
#include <numeric>

using namespace std;

struct Item {
    int idx; // index of the item
    int qty; // quantity of the item
    int cost_rate; // cost or rate of the item (depending on food or decor)
};

bool cmp(const Item &a, const Item &b) {
    return a.cost_rate < b.cost_rate;
}

void max_items(int n, int m, int b, vector<int> x, vector<int> c, vector<int> y, vector<int> r) {
    // Sort food items and decoration items by cost/rate
    vector<Item> food(n);
    for (int i = 0; i < n; i++) {
        food[i].idx = i;
        food[i].qty = x[i];
        food[i].cost_rate = c[i];
    }
    sort(food.begin(), food.end(), cmp);

    vector<Item> decor(m);
    for (int j = 0; j < m; j++) {
        decor[j].idx = j;
        decor[j].qty = y[j];
        decor[j].cost_rate = r[j];
    }
    sort(decor.begin(), decor.end(), cmp);

    // Initialize purchased items and remaining budget
    vector<int> purchased_food(n, 0);
    vector<int> purchased_decor(m, 0);
    int budget = b;

    // Buy as many items as possible starting from the cheapest ones
    for (int i = 0, j = 0; i < n && budget >= food[i].cost_rate; i++) {
        int max_qty = min(food[i].qty, budget / food[i].cost_rate);
        purchased_food[food[i].idx] = max_qty;
        budget -= max_qty * food[i].cost_rate;
    }

    for (int j = 0; j < m && budget >= decor[j].cost_rate; j++) {
        int max_qty = min(decor[j].qty, budget / decor[j].cost_rate);
        purchased_decor[decor[j].idx] = max_qty;
        budget -= max_qty * decor[j].cost_rate;
    }

    // Print the results
    int total_items = accumulate(purchased_food.begin(), purchased_food.end(), 0)
                    + accumulate(purchased_decor.begin(), purchased_decor.end(), 0);
    cout << total_items << endl;

    for (int i = 0; i < n; i++) {
        if (purchased_food[i] > 0) {
            cout << i+1 << " ";
        }
    }

    for (int j = 0; j < m; j++) {
        if (purchased_decor[j] > 0) {
            cout << n+j+1 << " ";
        }
    }

    cout << endl;
}

int main() {
    int n, m, b;
    cin >> n >> m >> b;

    vector<int> x(n), c(n), y(m), r(m);
    for (int i = 0; i < n; i++) {
        cin >> x[i] >> c[i];
    }
    for (int j = 0; j < m; j++) {
        cin >> y[j] >> r[j];
    }

    max_items(n, m, b, x, c, y, r);

    return 0;
}
