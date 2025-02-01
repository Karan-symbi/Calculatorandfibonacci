class Calculator {
    int[] input_nums = {};
    
    Calculator() {
        Input in = new Input();
        input_nums = in.input();
    }
    
    int calcSum() {
        return input_nums[0] + input_nums[1];
    }
    
    int calcDiff() {
        return input_nums[0] - input_nums[1];
    }
    
    
}
