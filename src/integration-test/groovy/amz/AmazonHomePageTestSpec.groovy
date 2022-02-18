package amz

import geb.spock.GebSpec

class AmazonHomePageTestSpec extends GebSpec{

    def "Amazon Home Page Test"() {

        when: 'try to visit amazon'
        go 'https://www.amazon.com/amazonprime'

        then: 'Home Offer Tittle Test'
        at AmazonHomePage

    }

}
