
#include<vector>
#include<iostream>

using namespace std;

vector<vector<int>> groupThePeople(vector<int>& groupSizes){

    /*
    Runtime: 12 ms, faster than 86.49%,
    Memory Usage: 13.2 MB, less than 66.47%.
    */


    vector<bool> in(groupSizes.size());

    if (groupSizes[0] == groupSizes.size()){

        vector<int> res;
        for (int i=0; i<groupSizes.size(); i++){
            res.push_back(i);
        }

        return vector<vector<int>> {res};
    } else {

        vector<vector<int>> groups;

        int i=0;
        while (i < groupSizes.size()){

            if (groupSizes[i] == 1){
                vector<int> newGroup;

                newGroup.push_back(i);
                groups.push_back(newGroup);
                in[i] = true;
                i++;
            } else {

                vector<int> newGroup;
                int size = groupSizes[i];

                if (!in[i]){
                    newGroup.push_back(i);
                    int j = i+1;
                    while(newGroup.size() < size){
                        if (groupSizes[j] == size && !in[j]){
                            newGroup.push_back(j);
                            in[j] = true;
                        } else {
                            j++;
                        }
                    }
                }

                if (newGroup.size()){ groups.push_back(newGroup); }
                i++;
            }
        }

        return groups;
    }

}

void printGroups(vector<vector<int>>& res){

    for (int i=0; i<res.size(); i++){

        cout << "[";
        for (int j=0; j<res[i].size(); j++){
            cout << res[i][j] << ", ";
        }
        cout << "],";
    }
    cout << endl;
}
