package com.bkacad.nnt.d02k11mvcdemo.presenter;

import com.bkacad.nnt.d02k11mvcdemo.model.MainModel;
import com.bkacad.nnt.d02k11mvcdemo.model.MainModelImpl;
import com.bkacad.nnt.d02k11mvcdemo.view.MainView;

public class MainPresenterImpl implements MainPresenter{

    private final MainModel mainModel;
    private final MainView mainView;

    public MainPresenterImpl(MainView mainView){
        this.mainView = mainView;
        this.mainModel = new MainModelImpl();
    }

    @Override
    public void onGetData() {
        // Gọi xuống model để xử lý
        try {
           String data =  mainModel.handleGetData();
           // Gửi về view
            mainView.getDataSuccess(data);
        } catch (Exception e) {
            mainView.getDataFail(e.getMessage());
            e.printStackTrace();
        }
    }
}
