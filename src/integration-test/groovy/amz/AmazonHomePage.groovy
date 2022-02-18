package amz

import geb.Page

class AmazonHomePage extends Page {

    static url = 'https://www.amazon.com/amazonprime'

    static at = {
        $('#prime-benefit-module-content-delivery-headline').text()?.contains 'Fast, free delivery'
    }

}
