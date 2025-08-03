public class userCompare {
     if(aName.compareTo(bName) < 0) {
        return -1;
    } else if(aName.compareTo(bName) > 0) {
        return 1;
    } else if(aId < bId) {
        return -1;
    } else if(aId > bId) {
        return 1;
    }
                            
    return 0;    
}
