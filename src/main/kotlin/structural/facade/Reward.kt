package structural.facade

class Reward {

    private val iGoogleReward: IGoogleReward = GoogleRewardImpl()
    private val iFacebookReward: IFacebookReward = FacebookRewardImp()


    fun getReward() = iFacebookReward.provideFacebookReward() +
            iGoogleReward.provideGoogleReward()

}