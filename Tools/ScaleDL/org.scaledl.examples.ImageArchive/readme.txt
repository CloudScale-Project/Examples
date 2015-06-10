The ImageArchive example of usage evolution
-------------------------------------------

This is a small example that illustrates the support for modelling evolution of work and load.

The example illustrates a small image storage and retrieval system with two main functions: publishing and retrieving images. 

The publish and retrieve functions of the web component have associated SEFFs (see the default.repository_diagram), and makes calls on corresponding store and get functions provided by the databse component. 
- the ImageArchive.publishImage() makes calls on ImageDatabase.storeImage() which defines the cpu and harddisk resource use as depending on the size of the image to be stored.
- the ImageArchiveWeb.retrieveImages() function is modelled with cpu resource use depending on the number of images and average size of the images, and makes calls to the ImageDatabase.getImages() function which defines the default values for the number of images and avarage size

Usage models are provided for open and closed workload for the publish function, and for closed workload for the retrieve function. The usage models define the default values for load in terms of inter arrival rate for the open workload, and population for the closed worklaod.

The usage evolution model for publish and retrieve closed workload uses the publishLoad.dlim model to describe how the population evolves over time (note that in this sense it is no longer a closed workload). They also use the ImageSizeEvolution.dlim to describe the evolution of image size over time.

The usage evolution model for publish with open workload uses the dlim files publishOpenLoad and ImageSizeOpenEvolution to describe the evolution of arrival rate and image size over time.

The .launch files are SimuLizar launch configurations for the different usage evolution models, and are set up with parameters that should work to run the simulation. Note that the open workload requires a lot of memory, and the simulation time has been set low to allow the simulation to complete.

