class Deletion 
{
    void delete()
    {
        int arr[] = {1,2,3,4,5};

        int size = 5;

        for (int i=0; i<size-1; i++)
        {
            arr[i] = arr[i+1];
        }

        size--;

        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        Deletion del = new Deletion();

        del.delete();
    }
}