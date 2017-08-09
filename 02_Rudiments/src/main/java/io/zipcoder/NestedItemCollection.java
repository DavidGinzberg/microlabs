package io.zipcoder;


public class NestedItemCollection {

    private NestedItem[] nestedItems;

    public NestedItemCollection(Integer[][] integerArrays) {
        nestedItems = new NestedItem[0];
        parseAndPopulateNestedItemsArray(integerArrays);
        assortByPrimeCount();


    }

    private void parseAndPopulateNestedItemsArray(Integer[][] integerArrays) {
        for (Integer[] integerArray : integerArrays) {
            NestedItem nestedItem = new NestedItem(integerArray);
            add(nestedItem);

        }
    }

    private void add(NestedItem item) {
        int tempArrayLength = nestedItems.length + 1;
        NestedItem[] tempArray = new NestedItem[tempArrayLength];
        System.arraycopy(nestedItems, 0, tempArray, 0, nestedItems.length);
        tempArray[tempArrayLength - 1] = item;
        nestedItems = tempArray;
    }

    public NestedItem[] getNestedItems() {
        return nestedItems;
    }

    public NestedItem getAtIndex(int index) {
        NestedItem response = null;
        if ((index >= nestedItems.length) || (index < 0)) {
            response = null;
        } else {
            response = nestedItems[index];
        }
        return response;
    }

    public int length() {
        return nestedItems.length;
    }

    public void assortByPrimeCount() {
        for (int i = 0; i < nestedItems.length - 1; i++) {
            boolean valid = true;
            do {
                for (int j = 0; j < nestedItems.length - 1; j++) {


                    if (nestedItems[j].getPrimeNumberCount() != 0 && nestedItems[j + 1].getPrimeNumberCount() ==0){

                        NestedItem temp = nestedItems[j];
                        nestedItems[j] = nestedItems[j + 1];
                        nestedItems[j + 1] = temp;

                    }

                    if (nestedItems[j].getPrimeNumberCount() == nestedItems[j + 1].getPrimeNumberCount()) {
                        tieBreaker(j);
                    }
                    if (nestedItems[j].getPrimeNumberCount() > nestedItems[j + 1].getPrimeNumberCount()) {
                        NestedItem temp = nestedItems[j];
                        nestedItems[j] = nestedItems[j + 1];
                        nestedItems[j + 1] = temp;

                    } else valid = false;
                }
            } while (valid);
        }

    }

    public void tieBreaker(int index) {

        Integer[] tieBreaker = nestedItems[index].getArrayOfInts();
        Integer[] tieBreaker2 = nestedItems[index + 1].getArrayOfInts();


        for (int j = 0; j < tieBreaker.length - 1; j++) {


            if (tieBreaker[j] % 2 == 0 && tieBreaker2[j] % 2 != 0){

                NestedItem temp = nestedItems[j+1];
                nestedItems[j+1] = nestedItems[j];
                nestedItems[j] = temp;
            }

            if (tieBreaker[j] % 2 != 0 && tieBreaker2[j] % 2 != 0){

                if(tieBreaker[j] > tieBreaker2[j]){
                    NestedItem temp = nestedItems[j+1];
                    nestedItems[j+1] = nestedItems[j];
                    nestedItems[j] = temp;
                }
            }

        }
    }
}

