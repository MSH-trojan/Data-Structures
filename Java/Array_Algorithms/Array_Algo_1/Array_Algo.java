public static int getRange (int[] ar)
{

	int max = ar[0];

	int min = ar[0];

	for (int i = 1; i < ar.length; i ++)
	{

		if (ar[i] > max)

			max = ar[i];

		else if (ar[i] < min)

			min = ar[i];

	}

	return (max – min);
}