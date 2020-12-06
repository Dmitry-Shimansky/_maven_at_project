package day23ClassWork.homeWork.utils.reporter;

public class Result {

    int status_id;

    public int Result(cucumber.api.Result.Type status) {

        switch (status) {
            case PASSED:
                status_id = 1;
                break;
            case FAILED:
                status_id = 5;
                break;
        }
        return status_id;
    }
}
