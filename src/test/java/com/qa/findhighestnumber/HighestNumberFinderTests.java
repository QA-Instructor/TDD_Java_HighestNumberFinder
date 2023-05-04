package com.qa.findhighestnumber;

import com.qa.findhighestnumber.HighestNumberFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HighestNumberFinderTests {


        @Test
        public void find_highest_in_array_of_one_expect_single_item()
        {
            // Arrange
            int array[] =
                    {
                            10
                    };
            HighestNumberFinder cut = new HighestNumberFinder();
            int expectedResult = 10;

            // Act
            int result = cut.findHighestNumber( array );

            // Assert
            assertEquals( expectedResult, result );
        }

    @Test
    public void find_highest_in_array_of_two_descending_expect_first_element()
    {
        // Arrange
        int array[] = {13, 4};
        int expectedResult = 13;
        HighestNumberFinder cut = new HighestNumberFinder();

        // Act
        int result = cut.findHighestNumber(array);

        // Assert
        assertEquals(expectedResult, result);
    }
    @Test
    public void Array_of_two_ascending_items_return_last_item()
    {
        // Arrange
        int[] values = { 7, 13 };
        int expectedResult = 13;
        HighestNumberFinder cut = new HighestNumberFinder();
        // Act
        int result = cut.findHighestNumber(values);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void find_highest_in_array_of_two_return_first_item()
    {
        // Arrange
        int[] values = { 20, 20 };
        int expectedResult = 20;
        HighestNumberFinder cut = new HighestNumberFinder();
        // Act
        int result = cut.findHighestNumber(values);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void find_highest_in_array_of_several_return_highest_item()
    {
        // Arrange
        int[] values = { 10, 20, 5, 17, 37, 14 };
        int expectedResult = 37;
        HighestNumberFinder cut = new HighestNumberFinder();
        // Act
        int result = cut.findHighestNumber(values);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void find_highest_in_array_of_several_including_negatives_return_highest_item()
    {
        // Arrange
        int[] values = { 10, 20, 5, -17, 40, 14, 0, -50 };
        int expectedResult = 40;
        HighestNumberFinder cut = new HighestNumberFinder();
        // Act
        int result = cut.findHighestNumber(values);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void when_array_is_empty_expect_exception()
    {
        // Arrange
        int[] values = { };
        HighestNumberFinder cut = new HighestNumberFinder();

        assertThrows(Exception.class, () -> cut.findHighestNumber(values));
//        // Act
//        int result = cut.findHighestNumber(values);
//        //Assert
//        assertEquals(expectedResult, result);
    }
}

