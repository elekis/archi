/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.model.viewpoints;

import org.eclipse.emf.ecore.EClass;

import com.archimatetool.model.IArchimatePackage;


/**
 * Infrastructure Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public class InfrastructureViewpoint extends AbstractViewpoint {
    
    EClass[] allowed = new EClass[] {
            IArchimatePackage.eINSTANCE.getLocation(),

            IArchimatePackage.eINSTANCE.getDevice(),
            IArchimatePackage.eINSTANCE.getNode(),
            IArchimatePackage.eINSTANCE.getInfrastructureInterface(),
            IArchimatePackage.eINSTANCE.getInfrastructureService(),
            IArchimatePackage.eINSTANCE.getInfrastructureFunction(),
            IArchimatePackage.eINSTANCE.getCommunicationPath(),
            IArchimatePackage.eINSTANCE.getSystemSoftware(),
            IArchimatePackage.eINSTANCE.getNetwork(),
            IArchimatePackage.eINSTANCE.getArtifact(),

            IArchimatePackage.eINSTANCE.getJunction(),
            IArchimatePackage.eINSTANCE.getAndJunction(),
            IArchimatePackage.eINSTANCE.getOrJunction(),
            
            IArchimatePackage.eINSTANCE.getSpecialisationRelationship(),
            IArchimatePackage.eINSTANCE.getCompositionRelationship(),
            IArchimatePackage.eINSTANCE.getAggregationRelationship(),
            IArchimatePackage.eINSTANCE.getAssignmentRelationship(),
            IArchimatePackage.eINSTANCE.getRealisationRelationship(),
            IArchimatePackage.eINSTANCE.getTriggeringRelationship(),
            IArchimatePackage.eINSTANCE.getFlowRelationship(),
            IArchimatePackage.eINSTANCE.getUsedByRelationship(),
            IArchimatePackage.eINSTANCE.getAccessRelationship(),
            IArchimatePackage.eINSTANCE.getAssociationRelationship()
    };
    
    @Override
    public String getName() {
        return Messages.InfrastructureViewpoint_0;
    }

    @Override
    public int getIndex() {
        return INFRASTRUCTURE_VIEWPOINT;
    }
    
    @Override
    public EClass[] getAllowedTypes() {
        return allowed;
    }
}