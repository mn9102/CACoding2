package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface clearDataAccessObject;

    final ClearOutputBoundary clearPresenter;


    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface, ClearOutputBoundary clearOutputBoundary){
        this.clearDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        String usernames = clearDataAccessObject.clear();

        boolean failed = usernames.equals("");

        ClearOutputData clearOutputData = new ClearOutputData(usernames, failed);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
